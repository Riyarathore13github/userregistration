package com.isecure.DTO;

public class UserDTO {
  private int id;

    @Override
    public String toString() {
        return "UserDTO{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", mobile=" + mobile + ", date=" + date + ", gender=" + gender + ", department=" + department + ", program=" + program + ", branch=" + branch + ", admission=" + admission + ", password=" + password + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String name,address,email,mobile,date,gender,department,program,branch,admission,password;
   
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
        public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    public String getDate()
    {
        return date;   
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    
        public String getDepartment(){
            return department;
        }
        public void setDepartment(String department){
            this.department=department;
        }
         public String getProgram(){
            return program;
        }
        public void setProgram(String program){
            this.program=program;
        }
         public String getBranch(){
            return branch;
        }
        public void setBranch(String branch){
            this.branch=branch;
        }
        public String getAdmission(){
        return admission;
        }
        public void setAdmission(String admission){
        this.admission=admission;   
        }
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}
