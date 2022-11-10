package com.cms.models;

import java.util.Objects;

public class Faculty {
		private int facultyId;
		private String facultyName;
		private String facultyAddress;
		private String mobile;
		private String email;
		private String username;
		private String password;
		public Faculty() {
			super();
		}
		public Faculty(int facultyId, String facultyName, String facultyAddress, String mobile, String email,
				String username, String password) {
			super();
			this.facultyId = facultyId;
			this.facultyName = facultyName;
			this.facultyAddress = facultyAddress;
			this.mobile = mobile;
			this.email = email;
			this.username = username;
			this.password = password;
		}
		public int getFacultyId() {
			return facultyId;
		}
		public void setFacultyId(int facultyId) {
			this.facultyId = facultyId;
		}
		public String getFacultyName() {
			return facultyName;
		}
		public void setFacultyName(String facultyName) {
			this.facultyName = facultyName;
		}
		public String getFacultyAddress() {
			return facultyAddress;
		}
		public void setFacultyAddress(String facultyAddress) {
			this.facultyAddress = facultyAddress;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyAddress="
					+ facultyAddress + ", mobile=" + mobile + ", email=" + email + ", username=" + username
					+ ", password=" + password + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(email, facultyAddress, facultyId, facultyName, mobile, password, username);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Faculty other = (Faculty) obj;
			return Objects.equals(email, other.email) && Objects.equals(facultyAddress, other.facultyAddress)
					&& facultyId == other.facultyId && Objects.equals(facultyName, other.facultyName)
					&& Objects.equals(mobile, other.mobile) && Objects.equals(password, other.password)
					&& Objects.equals(username, other.username);
		}
		
		
}
