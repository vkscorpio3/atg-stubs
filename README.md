## What?
Stubs of the ATG / Oracle Commerce Java Classes so you can build your Open Source Projects.  Not ever class or method is here, they are only added as needed.

## Why?
Suppose you want to release some open source project that is for use with the Oracle ATG Commerce platform...how could you reference the atg package namespace classes?  Those jars aren't available anywhere conveniently.  This project was started to offer java binary compatible references to based your project off of. 

## How?
In maven just include this as a provided dependency (provided because at runtime you'll use the actual ATG jars)
```
<dependency>
    <groupId>io.github.atg-stubs</groupId>
    <artifactId>atg-stubs</artifactId>
    <version>10.2.0-SNAPSHOT</version>
</dependency>
```

## Contribute?
This repo is organized such that each branch is a released version of Oracle Commerce.  Submit your PR's to the appropriate branch.  Link to javadocs if you can in your PRs and code.

