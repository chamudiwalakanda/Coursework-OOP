package dto;

public class MemberDto {
    
    private String memberid;
    private String name;
    private String email;
    private int phone;
    
    public MemberDto() {
    }

    public MemberDto(String memberid, String name, String email, int phone) {
        this.memberid = memberid;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MemberDto [memberid=" + memberid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }

    

}
