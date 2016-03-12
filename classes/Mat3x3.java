class Mat3x3{
	public double m00,m01,m02;
	public double m10,m11,m12;
	public double m20,m21,m22;
	public double invers(){
		double a00=m00,a01=m01,a02=m02;
		double a10=m10,a11=m11,a12=m12;
		double a20=m20,a21=m21,a22=m22;
		double v0=(a11*a22-a12*a21);//12-12
		double v1=(a10*a22-a12*a20);//12-02
		double v2=(a10*a21-a11*a20);//12-01
		double v4=(a01*a22-a02*a21);//02-12
		double v5=(a00*a22-a02*a20);//02-02
		double v6=(a00*a21-a01*a20);//02-01
		double v7=(a01*a12-a02*a11);//01-12
		double v8=(a00*a12-a02*a10);//01-02
		double v9=(a00*a11-a01*a10);//01-01
		//lv2=9;mul=18,sum=9,copy=9
		double v3=a00*(v0)-a01*(v1)+a02*(v2);//012-012
		//lv3=1;mul=3,sum=2,copy=1
		double det=1/v3;
		m00=v0*det;
		m01=-v4*det;
		m02=v7*det;
		m10=-v1*det;
		m11=v5*det;
		m12=-v8*det;
		m20=v2*det;
		m21=-v6*det;
		m22=v9*det;
		//total sum=11,mul=31,copy=20
		return det;
	}
}
