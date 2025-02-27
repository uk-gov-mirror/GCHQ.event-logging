# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/) 
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]


## [v5.0-beta.15_schema-v4.0-beta.3] - 2021-04-08

* Fix build number.


## [v5.0-beta.14_schema-v4.0-beta.3] - 2021-04-08

* Issue **gchq/stroom#2170** : Added better logging for FQDN resolution.

* Uplift gradle version.

* Uplift schema to `v4.0-beta.3`.


## [v5.0-beta.13_schema-v4.0-beta.1] - 2021-03-08

* No changes


## [v5.0-beta.12_schema-v4.0-beta.1] - 2021-03-08

* No changes


## [v5.0-beta.11_schema-v4.0-beta.1] - 2021-01-08

* Add additional `createOutcome` methods to `EventLoggingUtil`.


## [v5.0-beta.10_schema-v4.0-beta.1] - 2021-01-08

* Add `Purpose` arg to `loggedXXX` methods.

* Add example application

* Improve README


## [v5.0-beta.9_schema-v4.0-beta.1] - 2021-01-07

* Add missing handling of unsuccessful logged work outcome.


## [v5.0-beta.8_schema-v4.0-beta.1] - 2021-01-07

* Add overloaded `log` and `createEvent` methods to `EventLoggingService`.


## [v5.0-beta.7_schema-v4.0-beta.1] - 2021-01-07

* Add overloaded `log` method to `EventLoggingService`.


## [v5.0-beta.6_schema-v4.0-beta.1] - 2021-01-07

* Improve loggedXXX methods in `EventLoggingService`.


## [v5.0-beta.5_schema-v4.0-beta.1] - 2021-01-05

* Add loggedResult and loggedAction methods.


## [v5.0-beta.4_schema-v4.0-beta.1] - 2021-01-04

* Add `AdvancedQueryOperator` interface.


## [v5.0-beta.3_schema-v4.0-beta.1] - 2020-12-17

* Change `HasOutcome#getOutcome` to return `BaseOutcome`, improve binding for `HasOutcome`.


## [v5.0-beta.2_schema-v4.0-beta.1] - 2020-12-17

* Add `HasOutcome` interface and make all complex types with an Outcome element implement it.


## [v5.0-beta.1_schema-v4.0-beta.1] - 2020-12-17

* Uplifted schema to v4.0-beta.1

* Issue **gchq/event-logging-schema#54** : Remove `Outcome` from `Network`, add new `NetworkOutcome` class.

* Issue **gchq/event-logging-schema#63**: Allow `EventSource/Door` to be combined with `Device`, `Client` and `Server`.

* Issue **gchq/event-logging-schema#64**: Change `Door` sub-element constraints to be consistent with documentation.

* Issue **gchq/event-logging-schema#65**: Add enum values to `AuthenticateActionSimpleType` and `AuthenticateLogonTypeSimpleType` to better describe physical access events

* Issue **gchq/event-logging-schema#10** : Add `SearchResults` to `BaseMultiObjectComplexType` to allow for use cases like `View/SearchResults`. 

* Issue **gchq/event-logging-schema#10** : Add `Id`, `Name` and `Description` to `QueryComplexType` to allow the linking of query to results.

* Issue **gchq/event-logging-schema#39** : Add `TimeZoneName` element to `LocationComplexType` to improve the recording of time zone information.

* Issue **gchq/event-logging-schema#44** : Add `Approval` schema action.

* Issue **gchq/event-logging-schema#47** : Add `CachedInteractive`, `CachedRemoteInteractive`, `Proxy` and `Other` logon types to `AuthenticateLogonTypeSimpleType`.

* Issue **gchq/event-logging-schema#40**: Add `State`, `City` and `Town` elements to provide more Location detail.

* Issue **gchq/event-logging-schema#3** : Add `Type` attribute to `Hash` element in `BaseFileComplexType`.

* Issue **gchq/event-logging-schema#35** : Add `Meta` element to `Event` and `BaseObjectGroup` to allow extension/decoration.

* Issue **gchq/event-logging-schema#31** : Add `Tags` element to `BaseObjectGroup`.

* Issue **gchq/event-logging-schema#37** : Add `Tags` element to `SystemComplexType`.

* Generate javadoc from the schema annotations.

* Issue **5** : Add fluent builder api code.

* Issue **3** : Change xjc bindings to force all top level classes [BREAKING CHANGE].

* Issue **6** : Fix hard coded success value in EventLoggingUtil.createOutcome().

* Revert to Java 8


## [v4.0.7_schema-v3.2.4] - 2018-09-07

* Update to Java 10

* Issue **gchq/event-logging-schema#33** : Add content to `ClassificationComplexType` to support richer protective marking schemes


## [v4.0.5_schema-v3.2.4] - 2018-09-05

* Added automatic module name for Java 9 builds.


## [v3.2.4_schema-v3.2.4] - 2018-05-30

* Fix for log receiver class name.


## [v3.2.3_schema-v3.2.4] - 2018-05-22


## [v3.2.1_schema-v3.2.4] - 2018-02-15

### Changed

* Uplifted schema to v3.2.4

* Add _-client_ to the end of the `id` attribute value on the `schema` element.


## [v3.2.0_schema-v3.2.0] - 2017-12-21

### Added

* Issue **gchq/event-logging-schema#23** : Add optional `Coordinates` object to the `Location` class to capture latitude/longitude

### Changed

* Uplifted schema to v3.2.0


## [v3.1.2_schema-v3.1.2] - 2017-11-28

### Added

* Add Bintray deployment


## [v3.1.1_schema-v3.1.2] - 2017-11-14

### Added

* Add sources and javadoc jars

### Changed

* Uplift schema to v3.1.2

* Change build to Gradle


## [v3.1.0] - 2017-04-05
Intial open source release

[Unreleased]: https://github.com/gchq/event-logging/compare/v5.0-beta.15_schema-v4.0-beta.3...HEAD
[v5.0-beta.15_schema-v4.0-beta.3]: https://github.com/gchq/event-logging/compare/v5.0-beta.14_schema-v4.0-beta.1...v5.0-beta.15_schema-v4.0-beta.3
[v5.0-beta.14_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.13_schema-v4.0-beta.1...v5.0-beta.14_schema-v4.0-beta.1
[v5.0-beta.13_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.12_schema-v4.0-beta.1...v5.0-beta.13_schema-v4.0-beta.1
[v5.0-beta.12_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.11_schema-v4.0-beta.1...v5.0-beta.12_schema-v4.0-beta.1
[v5.0-beta.11_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.10_schema-v4.0-beta.1...v5.0-beta.11_schema-v4.0-beta.1
[v5.0-beta.10_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.9_schema-v4.0-beta.1...v5.0-beta.10_schema-v4.0-beta.1
[v5.0-beta.9_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.8_schema-v4.0-beta.1...v5.0-beta.9_schema-v4.0-beta.1
[v5.0-beta.8_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.7_schema-v4.0-beta.1...v5.0-beta.8_schema-v4.0-beta.1
[v5.0-beta.7_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.6_schema-v4.0-beta.1...v5.0-beta.7_schema-v4.0-beta.1
[v5.0-beta.6_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.5_schema-v4.0-beta.1...v5.0-beta.6_schema-v4.0-beta.1
[v5.0-beta.5_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.4_schema-v4.0-beta.1...v5.0-beta.5_schema-v4.0-beta.1
[v5.0-beta.4_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.3_schema-v4.0-beta.1...v5.0-beta.4_schema-v4.0-beta.1
[v5.0-beta.3_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.2_schema-v4.0-beta.1...v5.0-beta.3_schema-v4.0-beta.1
[v5.0-beta.2_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v5.0-beta.1_schema-v4.0-beta.1...v5.0-beta.2_schema-v4.0-beta.1
[v5.0-beta.1_schema-v4.0-beta.1]: https://github.com/gchq/event-logging/compare/v4.0.7_schema-v3.2.4...v5.0-beta.1_schema-v4.0-beta.1

