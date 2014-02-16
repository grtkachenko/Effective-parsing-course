#!/usr/bin/perl
while (<>) {
    s/\b(A|a)(A|a)*\b/argh/;
    print;
}
