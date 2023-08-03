package com.spring.controller;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.spring.command.MultipartCommand;

@Controller
public class FileUploadController {

	@GetMapping("/fileUploadForm")
	public void fileUpload() {}
	
	@PostMapping(value = "/multipartFile",produces="text/plain;charset=utf-8")
	public ModelAndView uploadByMultipartFile(@RequestParam(defaultValue = "제목없음") String title,
			 								  @RequestParam("file") MultipartFile multi,										    
			                                  ModelAndView mnv
											  ) throws Exception {
		
		System.out.println("title : "+title);
		System.out.println("file name : "+multi.getOriginalFilename() );
		
		/* 파일저장폴더설정 */
		String uploadPath ="c:\\upload\\file";
		
		/* 파일명 중복방지 */
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String fileName = uuid+"__"+multi.getOriginalFilename();
		
		/* 파일 경로확인 및 생성 */
		File file = new File(uploadPath, fileName);
		file.mkdirs();
		
		/* 파일저장 */
		multi.transferTo(file);

		mnv.addObject("title", title);
		mnv.addObject("originalFileName", multi.getOriginalFilename());
		mnv.addObject("uploadedFileName", file.getName());
		mnv.addObject("uploadPath", file.getAbsolutePath());
		mnv.setViewName("/fileUploaded");
		
		return mnv;
	}
	
	@PostMapping(value = "/multipartHttpServletRequest",produces="text/plain;charset=utf-8")
	public ModelAndView uploadByMultipartHttpServletRequest(
										MultipartHttpServletRequest request,												
	         							ModelAndView mnv) throws Exception {
		String title = request.getParameter("title");
		MultipartFile multi = request.getFile("file");
		
		mnv = uploadByMultipartFile(title,multi,mnv);
		
		return mnv;
	}
	
	@PostMapping(value = "/commandObject",produces="text/plain;charset=utf-8")
	public ModelAndView uploadByCommandObject(MultipartCommand command, 
											  ModelAndView mnv) throws Exception {
		
		MultipartFile multi = command.getFile();
		String title = command.getTitle();
		
		mnv = uploadByMultipartFile(title,multi,mnv);
		
		return mnv;
	}
}








