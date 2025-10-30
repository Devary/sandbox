package org.eclipse.microprofile.openapi.annotations.tags;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Minimal stub of the MicroProfile {@code Tag} annotation. This avoids
 * compilation failures when the full MicroProfile OpenAPI API is not on the
 * classpath.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Tag {

    /**
     * Display name of the tag.
     */
    String name() default "";

    /**
     * Optional description that accompanies the tag.
     */
    String description() default "";
}
