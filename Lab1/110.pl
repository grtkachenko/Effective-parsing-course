#!/usr/bin/perl
while (<>) {
    print if /\b(\w(\w)*)\g1\b/;
}
