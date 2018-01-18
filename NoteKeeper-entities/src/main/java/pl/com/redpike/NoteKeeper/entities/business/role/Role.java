package pl.com.redpike.NoteKeeper.entities.business.role;

import pl.com.redpike.NoteKeeper.entities.business.permission.Permission;
import pl.com.redpike.NoteKeeper.entities.utility.DbObjectNames;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = DbObjectNames.ROLES, schema = DbObjectNames.SCHEMA)
public class Role {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", precision = 9, unique = true, nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "role")
    private Set<Permission> permissions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
                Objects.equals(name, role.name) &&
                Objects.equals(permissions, role.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, permissions);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
