package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@Id
	private String id;
	@NonNull
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private Float salary;
	@NonNull
	private boolean single;
	 @NonNull
	private LocalDateTime dob;
}
