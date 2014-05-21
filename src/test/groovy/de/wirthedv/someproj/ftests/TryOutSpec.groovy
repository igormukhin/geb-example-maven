package de.wirthedv.someproj.ftests;

import static org.junit.Assert.*
import geb.spock.GebReportingSpec

import org.junit.Test

import spock.lang.Specification;
import spock.lang.Stepwise

class TryOutSpec extends Specification {

	def "just a try"() {
		when:
		def list = [1, 2, 3]
		
		then:
		list.size == 3
	}
}
