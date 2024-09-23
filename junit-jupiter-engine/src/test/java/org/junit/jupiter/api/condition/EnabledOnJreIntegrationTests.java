/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.jupiter.api.condition;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.condition.JRE.JAVA_10;
import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_12;
import static org.junit.jupiter.api.condition.JRE.JAVA_13;
import static org.junit.jupiter.api.condition.JRE.JAVA_14;
import static org.junit.jupiter.api.condition.JRE.JAVA_15;
import static org.junit.jupiter.api.condition.JRE.JAVA_16;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;
import static org.junit.jupiter.api.condition.JRE.JAVA_18;
import static org.junit.jupiter.api.condition.JRE.JAVA_19;
import static org.junit.jupiter.api.condition.JRE.JAVA_20;
import static org.junit.jupiter.api.condition.JRE.JAVA_21;
import static org.junit.jupiter.api.condition.JRE.JAVA_22;
import static org.junit.jupiter.api.condition.JRE.JAVA_23;
import static org.junit.jupiter.api.condition.JRE.JAVA_24;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_9;
import static org.junit.jupiter.api.condition.JRE.OTHER;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava10;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava11;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava12;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava13;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava14;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava15;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava16;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava17;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava18;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava19;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava20;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava21;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava22;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava23;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava24;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava8;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onJava9;
import static org.junit.jupiter.api.condition.JavaVersionPredicates.onKnownVersion;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Integration tests for {@link EnabledOnJre}.
 *
 * @since 5.1
 */
class EnabledOnJreIntegrationTests {

	@Test
	@Disabled("Only used in a unit test via reflection")
	void enabledBecauseAnnotationIsNotPresent() {
	}

	@Test
	@Disabled("Only used in a unit test via reflection")
	@EnabledOnJre({})
	void missingJreDeclaration() {
	}

	@Test
	@EnabledOnJre({ //
			JAVA_8, //
			JAVA_9, //
			JAVA_10, //
			JAVA_11, //
			JAVA_12, //
			JAVA_13, //
			JAVA_14, //
			JAVA_15, //
			JAVA_16, //
			JAVA_17, //
			JAVA_18, //
			JAVA_19, //
			JAVA_20, //
			JAVA_21, //
			JAVA_22, //
			JAVA_23, //
			JAVA_24, //
			OTHER //
	})
	void enabledOnAllJavaVersions() {
	}

	@Test
	@EnabledOnJre(JAVA_8)
	void java8() {
		assertTrue(onJava8());
	}

	@Test
	@EnabledOnJre(JAVA_9)
	void java9() {
		assertTrue(onJava9());
	}

	@Test
	@EnabledOnJre(JAVA_10)
	void java10() {
		assertTrue(onJava10());
	}

	@Test
	@EnabledOnJre(JAVA_11)
	void java11() {
		assertTrue(onJava11());
	}

	@Test
	@EnabledOnJre(JAVA_12)
	void java12() {
		assertTrue(onJava12());
	}

	@Test
	@EnabledOnJre(JAVA_13)
	void java13() {
		assertTrue(onJava13());
	}

	@Test
	@EnabledOnJre(JAVA_14)
	void java14() {
		assertTrue(onJava14());
	}

	@Test
	@EnabledOnJre(JAVA_15)
	void java15() {
		assertTrue(onJava15());
	}

	@Test
	@EnabledOnJre(JAVA_16)
	void java16() {
		assertTrue(onJava16());
	}

	@Test
	@EnabledOnJre(JAVA_17)
	void java17() {
		assertTrue(onJava17());
	}

	@Test
	@EnabledOnJre(JAVA_18)
	void java18() {
		assertTrue(onJava18());
	}

	@Test
	@EnabledOnJre(JAVA_19)
	void java19() {
		assertTrue(onJava19());
	}

	@Test
	@EnabledOnJre(JAVA_20)
	void java20() {
		assertTrue(onJava20());
	}

	@Test
	@EnabledOnJre(JAVA_21)
	void java21() {
		assertTrue(onJava21());
	}

	@Test
	@EnabledOnJre(JAVA_22)
	void java22() {
		assertTrue(onJava22());
	}

	@Test
	@EnabledOnJre(JAVA_23)
	void java23() {
		assertTrue(onJava23());
	}

	@Test
	@EnabledOnJre(JAVA_24)
	void java24() {
		assertTrue(onJava24());
	}

	@Test
	@EnabledOnJre(value = OTHER, disabledReason = "Disabled on almost every JRE")
	void other() {
		assertFalse(onKnownVersion());
	}

}
