package com.ITSI.itsiweb.utils;

public class RoleAuthorizationConstants {
    private static final String ROLE = "ROLE_";
    private static final String HAS_ROLE = "hasRole";

    public static final String ADMINISTRATOR_ROLE = "ADMINISTRATOR";
    public static final String STUDENT_ROLE = "STUDENT";
    public static final String ACCOUNTANT_ROLE = "ACCOUNTANT";
    public static final String AUX_ACCOUNTANT_ROLE = "AUXILIARY_ACCOUNTANT";
    public static final String SECRETARY_ROLE = "SECRETARY";

    public static final String ADMINISTRATOR = HAS_ROLE + "('" + ROLE + ADMINISTRATOR_ROLE + "')";
    public static final String STUDENT = HAS_ROLE + "('" + ROLE + STUDENT_ROLE + "')";
    public static final String ACCOUNTANT = HAS_ROLE + "('" + ROLE + ACCOUNTANT_ROLE + "')";
    public static final String AUXILIARY_ACCOUNTANT = HAS_ROLE + "('" + ROLE + AUX_ACCOUNTANT_ROLE + "')";
    public static final String SECRETARY = HAS_ROLE + "('" + ROLE + SECRETARY_ROLE + "')";

    public static final String AND = " AND ";
    public static final String OR = " OR ";
}
