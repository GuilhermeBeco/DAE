package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name = "ADMINS")
@NamedQueries({
        @NamedQuery(
                name = "getAllAdmins",
                query = "SELECT d FROM Admin d ORDER BY d.name" // JPQL
        )
})
public class Admin extends Pessoa {
    @NotNull
    private int adminCode;

    public Admin(String username, String password, String email, String name, int adminCode) {
        super(username, password, email, name);
        this.adminCode = adminCode;
    }

    public Admin() {

    }

    public int getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(int adminCode) {
        this.adminCode = adminCode;
    }
}
