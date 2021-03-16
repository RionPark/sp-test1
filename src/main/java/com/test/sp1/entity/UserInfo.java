package com.test.sp1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.test.sp1.util.DateUtil;

import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@SequenceGenerator(name = "seqUiNum",sequenceName = "seq_ui_num", allocationSize = 1)
	@GeneratedValue(generator = "seqUiNum", strategy = GenerationType.SEQUENCE)
	@Column(name="ui_num")
	private Integer uiNum;
	@Column(name="ui_name")
	private String uiName;
	@Column(name="ui_id")
	private String uiId;
	@Column(name="ui_pwd")
	private String uiPwd;
	@Column(name="ui_genre")
	private String uiGenre;
	@Column(name="ui_email")
	private String uiEmail;
	@Column(name="ui_phone1")
	private String uiPhone1;
	@Column(name="ui_phone2")
	private String uiPhone2;
	@Column(name="ui_address")
	private String uiAddress;
	@Column(name="ui_hint")
	private String uiHint;
	@Column(name="ui_answer")
	private String uiAnswer;
	private String credat = DateUtil.getDate();
	private String cretim = DateUtil.getTime();
	private String moddat = DateUtil.getDate();
	private String modtim = DateUtil.getTime();
	@Column(name="ui_img")
	private String uiImg;
}
