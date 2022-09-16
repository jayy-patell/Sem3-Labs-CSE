module struct(x1, x2, x3, x4, f, f1);
	input x1, x2, x3, x4;
	output f,f1;
	and(r1,x2,x3,x4);
	and(r2,x1,x3,x4);
	and(r3,x1,x2,x4);
	or(f,r1,r2,r3);
	
	assign f1 = (x2 & x3 & x4) | (x1 & x3 & x4) | (x1 & x2 & x4);
endmodule