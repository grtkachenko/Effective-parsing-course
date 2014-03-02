#!/usr/bin/perl
use strict;

my $is_first = 1;
my $need_to_print = 0;

while (<>) {
    s/\<(.)*?\>//g;
    
    if (/[^\s]/) {
        if ($need_to_print && !$is_first) {
            print "\n";
        }
        s/((\s)*)/$2/g;
        s/^( )+//g;
        s/( )+$//g;
        print;
        $need_to_print = 0;
        $is_first = 0;
    } else {
        $need_to_print = 1;
    }
}
