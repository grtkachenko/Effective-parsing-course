#!/usr/bin/perl
while (<>) {
    print if /\b\d(\d)*\b/;
}
