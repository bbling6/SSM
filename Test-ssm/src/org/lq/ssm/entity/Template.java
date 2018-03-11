package org.lq.ssm.entity;
/**
 * 模板
 * @author lanqiao
 *
 */
public class Template {

	private Integer id;//模板编号
	private String tempTittle;//模板标题
	private String tempContent;//模板内容
	private String tempType;//模板类别
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTempTittle() {
		return tempTittle;
	}
	public void setTempTittle(String tempTittle) {
		this.tempTittle = tempTittle;
	}
	public String getTempContent() {
		return tempContent;
	}
	public void setTempContent(String tempContent) {
		this.tempContent = tempContent;
	}
	public String getTempType() {
		return tempType;
	}
	public void setTempType(String tempType) {
		this.tempType = tempType;
	}
	@Override
	public String toString() {
		return "Template [id=" + id + ", tempContent=" + tempContent
				+ ", tempTittle=" + tempTittle + ", tempType=" + tempType + "]";
	}
	
}
