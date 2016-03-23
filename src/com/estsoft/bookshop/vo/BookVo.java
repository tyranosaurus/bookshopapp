package com.estsoft.bookshop.vo;

public class BookVo 
{
	private Long no;
	private String title;
	private String state;
	private Long authorNo;
	private String authorName;	
//	private AuthorVo authorVo; 이렇게 하는 방법도 있음
	
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", state=" + state + ", authorNo=" + authorNo + ", authorName="
				+ authorName + "]";
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}
	
}
