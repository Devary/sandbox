package org.eclipse.microprofile.openapi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Minimal stub of the MicroProfile {@code Operation} annotation. This keeps
 * the application compiling in environments where the real MicroProfile
 * OpenAPI dependency is not available.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Operation {

    /**
     * Short summary of the associated operation.
     */
    String summary() default "";

    /**
     * Additional human readable description of the operation.
     */
    String description() default "";
}
