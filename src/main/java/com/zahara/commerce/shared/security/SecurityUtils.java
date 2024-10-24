//package ca.utoronto.lms.shared.security;
//
//import io.jsonwebtoken.Claims;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class SecurityUtils {
//    public static Long ROLE_ROOT_ID = 1L;
//    public static String ROLE_ROOT = "ROLE_ROOT";
//
//    public static Long ROLE_ADMIN_ID = 2L;
//    public static String ROLE_ADMIN = "ROLE_ADMIN";
//
//    public static Long ROLE_TEACHER_ID = 3L;
//    public static String ROLE_TEACHER = "ROLE_TEACHER";
//
//    public static Long ROLE_STUDENT_ID = 4L;
//    public static String ROLE_STUDENT = "ROLE_STUDENT";
//
//    public static Long ROOT_USER_ID = 1337L;
//
//    public static String USER_ID_CLAIM = "userId";
//    public static String ADMIN_ID_CLAIM = "adminId";
//    public static String TEACHER_ID_CLAIM = "teacherId";
//    public static String STUDENT_ID_CLAIM = "studentId";
//
//    public static String BEARER_PREFIX = "Bearer ";
//
//    public static String getUsername() {
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        return principal instanceof UserDetails ? ((UserDetails) principal).getUsername() : "";
//    }
//
//    public static Claims getClaims() {
//        return (Claims) SecurityContextHolder.getContext().getAuthentication().getCredentials();
//    }
//
//    public static Long getUserId() {
//        return getClaims().get(USER_ID_CLAIM, Long.class);
//    }
//
//    public static Long getAdminId() {
//        return getClaims().get(ADMIN_ID_CLAIM, Long.class);
//    }
//
//    public static Long getTeacherId() {
//        return getClaims().get(TEACHER_ID_CLAIM, Long.class);
//    }
//
//    public static Long getStudentId() {
//        return getClaims().get(STUDENT_ID_CLAIM, Long.class);
//    }
//
//    public static boolean hasAuthority(String authority) {
//        return SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
//                .anyMatch(r -> r.getAuthority().equals(authority));
//    }
//}

package com.zahara.commerce.shared.security;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUtils {
    public static Long ROLE_ROOT_ID = 1L;
    public static String ROLE_ROOT = "ROLE_ROOT";
    public static Long ROLE_ADMIN_ID = 2L;
    public static String ROLE_ADMIN = "ROLE_ADMIN";
    public static Long ROLE_MANAGER_ID = 1L;
    public static String ROLE_MANAGER = "ROLE_MANAGER";
    public static Long ROLE_CUSTOMERSERVICEREP_ID = 2L;
    public static String ROLE_CUSTOMERSERVICEREP = "ROLE_CUSTOMERSERVICEREP";
    public static Long ROLE_CUSTOMER_ID = 3L;
    public static String ROLE_CUSTOMER = "ROLE_CUSTOMER";

    public static Long ROOT_USER_ID = 1337L;


    public static String USER_ID_CLAIM = "userId";
    public static String MANAGER_ID_CLAIM = "managerId";
    public static String CUSTOMERSERVICEREP_ID_CLAIM = "customerServiceRepId";
    public static String CUSTOMER_ID_CLAIM = "customerId";

    public static String BEARER_PREFIX = "Bearer ";

    public static String getUsername() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return principal instanceof UserDetails ? ((UserDetails) principal).getUsername() : "";
    }

    public static Claims getClaims() {
        return (Claims) SecurityContextHolder.getContext().getAuthentication().getCredentials();
    }

    public static Long getUserId() {
        return getClaims().get(USER_ID_CLAIM, Long.class);
    }

    public static Long getManagerId() {
        return getClaims().get(MANAGER_ID_CLAIM, Long.class);
    }

    public static Long getCustomerServiceRepId() {
        return getClaims().get(CUSTOMERSERVICEREP_ID_CLAIM, Long.class);
    }

    public static Long getCustomerId() {
        return getClaims().get(CUSTOMER_ID_CLAIM, Long.class);
    }

    public static boolean hasAuthority(String authority) {
        return SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals(authority));
    }
}

