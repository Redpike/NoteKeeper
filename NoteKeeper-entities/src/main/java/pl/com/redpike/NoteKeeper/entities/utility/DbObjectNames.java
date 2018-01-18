package pl.com.redpike.NoteKeeper.entities.utility;

public class DbObjectNames {

    /**
     * SCHEMA
     */
    public static final String SCHEMA = "notekeeper";

    /**
     * TABLE NAMES
     */
    private static final String TABLE_PREFIX = "t_";
    public static final String USERS = TABLE_PREFIX + "users";
    public static final String ROLES = TABLE_PREFIX + "roles";
    public static final String PERMISSIONS = TABLE_PREFIX + "permissions";
}
