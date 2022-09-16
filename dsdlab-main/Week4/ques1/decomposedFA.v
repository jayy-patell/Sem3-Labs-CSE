module decomposedFA(a,b,cin,s,cout);
	input a,b,cin;
	output s,cout;
	ha stage0(a,b,s1,c1);
	ha stage1(s1,cin,s,c2);
	or (cout,c1,c2);
endmodule

module ha(a,b,s,cout);
	input a,b;
	output s,cout;
	assign s = a ^ b;
	assign cout = a & b;
endmodule