class Mat2x2{
	public double m00,m01;
	public double m10,m11;
	public double invers(){
		double a00=m00,a01=m01;
		double a10=m10,a11=m11;
		double v0=(a00*a11-a01*a10);//01-01
		//lv2=1;mul=2,sum=1,copy=1
		double det=1/v0;
		m00=null*det;
		m01=-null*det;
		m10=-null*det;
		m11=null*det;
		//total sum=1,mul=7,copy=6
		return det;
	}
}
