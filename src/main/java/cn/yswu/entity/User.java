package cn.yswu.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author yswu
 * @date 2021-07-08 14:48
 */
public class User {

    private Integer id;
    @NotEmpty(message="邮箱地址不能为空！")
    @Email(message="请输入正确的邮箱格式")
    private String email;
    @NotEmpty(message="密码必须输入！")
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
