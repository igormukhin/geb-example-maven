package de.wirthedv.someproj.ftests;

import geb.spock.GebReportingSpec

import spock.lang.Stepwise

// to run this class from eclipse you need add /src/test/groovy as Source Folder and configure its output folder to target/test-classes 
@Stepwise
class SomeGenTryOutSpec extends GebReportingSpec {

	def "visit a page"() {
		
		when:
		go "http://wordpress.com/"
		
		then:
		title.startsWith "WordPress.com"  
	}

}
