#!/usr/bin/perl
while (<>) {
    s/(\p{L})(\g1)*/$1/g;
    print;
}
