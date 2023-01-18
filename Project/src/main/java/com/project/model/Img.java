package com.project.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Img {
	private String img_name,img_origname,img_keyword;
	private int img_pid_p_fk,img_id;
	

}
