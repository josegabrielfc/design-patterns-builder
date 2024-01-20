/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Builder;

/**
 *
 * @author jgfch
 */
public class UsuarioDTO {

    private final String name;
    private final String lastname;
    private final String email;
    private final String phoneNumber;
    private final String birthdate;
    private final String gender;
    private final String civilStatus;

    public UsuarioDTO(Builder builder) {
        this.name = builder.name;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.birthdate = builder.birthdate;
        this.gender = builder.gender;
        this.civilStatus = builder.civilStatus;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public static class Builder {

        private String name;
        private String lastname;
        private String email;
        private String phoneNumber;
        private String birthdate;
        private String gender;
        private String civilStatus;

        public UsuarioDTO.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public UsuarioDTO.Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UsuarioDTO.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UsuarioDTO.Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UsuarioDTO.Builder setBirthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public UsuarioDTO.Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public UsuarioDTO.Builder setCivilStatus(String civilStatus) {
            this.civilStatus = civilStatus;
            return this;
        }

        public UsuarioDTO build() {
            if (name == null) {
                name = "";
            }
            return new UsuarioDTO(this);
        }
    }
}
