module full_adder(a,b,c_in,s,c);
input a,b,c_in;
output s,c;
assign s = a^b^c_in;
assign c = (a&b)|(b&c_in)|(c_in&a);
endmodule
