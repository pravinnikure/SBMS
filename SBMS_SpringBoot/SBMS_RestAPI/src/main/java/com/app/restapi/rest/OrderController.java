package com.app.restapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/order")

public class OrderController 
{
		@PostMapping("/create")
		public ResponseEntity<String> create()
		{
			return new ResponseEntity<String>("Order Created ",HttpStatus.OK);
		}
		
		@GetMapping("/get")
		public ResponseEntity<String> fetch()
		{
			return new ResponseEntity<String>("Order fetched ",HttpStatus.OK);
		}
		
		@PutMapping("/update")
		public ResponseEntity<String> modify()
		{
			return new ResponseEntity<String>("Order modified ",HttpStatus.OK);
		}
		
		@DeleteMapping("/delete")
		public ResponseEntity<String> remove()
		{
			return new ResponseEntity<String>("Order deleted ",HttpStatus.OK);
		}
		
		@PatchMapping("/partial")
		public ResponseEntity<String> modufy()
		{
			return new ResponseEntity<String>("Order partially updated ",HttpStatus.OK);
		}
}
