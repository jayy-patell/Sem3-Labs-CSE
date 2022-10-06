
module MUX4to1(w,s,f);
	input [3:0]w;
	input [1:0]s;
	output f;
	wire [1:0]ft;

	MUX2to1 s1(w[1:0], s[0], ft[0]);
	MUX2to1 s2(w[3:2], s[0], ft[1]);
	MUX2to1 s3(ft[1:0], s[1], f);
endmodule

module MUX2to1(w,s,f);
	input [1:0]w;
	input s;
	output f;
	reg f;
	always @(w or s)
	if(s==0)
	f=w[0];
	else
	f=w[1];
endmodule


// module MUX4to1(w,s,f);
// 	input [3:0]w, [1:0]s;
// 	output f;
// 	reg f;
// 	always @(w or s)
// 	if(s==0)
// 	f=w[0];
// 	else if(s==1)
// 	f=w[1];
// 	else if(s==2)
// 	f=w[2];
// 	else if(s==3)
// 	f=w[3];
// endmodule;