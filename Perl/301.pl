#!/usr/bin/perl
use strict;
use warnings;

my $is_first = 1;
my $need_to_print = 0;

while (<>) {
    if (/[^\s]/) {
        if ($need_to_print && !$is_first) {
            print "\n";
        }
        s/(\s)?+/$1/g;
        print;
        $need_to_print = 0;
        $is_first = 0;
    } else {
        $need_to_print = 1;
    }
}
