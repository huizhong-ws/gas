/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.wireless.web.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

import com.wireless.entity.Menutypetbl;

/** 
 * MyEclipse Struts
 * Creation date: 09-07-2013
 * 
 * XDoclet definition:
 * @struts.form name="menuForm"
 */
public class MenuForm extends ActionForm {
	private Integer id;
	private Menutypetbl menutypetbl;
	private String name;
	private String price;
	private String pic;
	private String remark;
	private FormFile photo;
	public FormFile getPhoto() {
		return photo;
	}
	public void setPhoto(FormFile photo) {
		this.photo = photo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Menutypetbl getMenutypetbl() {
		return menutypetbl;
	}
	public void setMenutypetbl(Menutypetbl menutypetbl) {
		this.menutypetbl = menutypetbl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}