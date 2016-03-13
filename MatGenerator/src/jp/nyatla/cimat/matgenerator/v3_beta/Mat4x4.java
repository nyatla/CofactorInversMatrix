package jp.nyatla.cimat.matgenerator.v3_beta;

class Mat4x4{
	public double m00,m01,m02,m03;
	public double m10,m11,m12,m13;
	public double m20,m21,m22,m23;
	public double m30,m31,m32,m33;
	public double invers(){
		double a00=m00,a01=m01,a02=m02,a03=m03;
		double a10=m10,a11=m11,a13=m13;
		double a20=m20,a21=m21,a22=m22,a23=m23;
		double a30=m30,a31=m31,a32=m32,a33=m33;
		double v0=(a21*a33-a23*a31);//23-13
		double v1=(a21*a32-a22*a31);//23-12
		double v3=(a20*a33-a23*a30);//23-03
		double v4=(a20*a32-a22*a30);//23-02
		double v6=(a20*a31-a21*a30);//23-01
		double v10=(a22*a33-a23*a32);//23-23
		double v15=(a00*a33-a13*a32);//13-23
		double v16=(-a13*a31);//13-13
		double v17=(-a00*a31);//13-12
		double v19=(-a13*a30);//13-03
		double v20=(-a00*a30);//13-02
		double v24=(a00*a23-a13*a22);//12-23
		double v25=(-a13*a21);//12-13
		double v26=(-a00*a21);//12-12
		double v28=(-a13*a20);//12-03
		double v29=(-a00*a20);//12-02
		//lv2=16;mul=32,sum=16,copy=16
		double v2=-a00*(v0)+a13*(v1);//123-123
		double v5=-a00*(v3)+a13*(v4);//123-023
		double v7=a13*(v6);//123-013
		double v8=a00*(v6);//123-012
		double v11=a01*(v10)-a02*(v0)+a03*(v1);//023-123
		double v12=a00*(v10)-a02*(v3)+a03*(v4);//023-023
		double v13=a00*(v0)-a01*(v3)+a03*(v6);//023-013
		double v14=a00*(v1)-a01*(v4)+a02*(v6);//023-012
		double v18=a01*(v15)-a02*(v16)+a03*(v17);//013-123
		double v21=a00*(v15)-a02*(v19)+a03*(v20);//013-023
		double v22=a00*(v16)-a01*(v19);//013-013
		double v23=a00*(v17)-a01*(v20);//013-012
		double v27=a01*(v24)-a02*(v25)+a03*(v26);//012-123
		double v30=a00*(v24)-a02*(v28)+a03*(v29);//012-023
		double v31=a00*(v25)-a01*(v28);//012-013
		double v32=a00*(v26)-a01*(v29);//012-012
		//lv3=16;mul=38,sum=22,copy=16
		double v9=a00*(v2)-a01*(v5)+a02*(v7)-a03*(v8);//0123-0123
		//lv4=1;mul=4,sum=3,copy=1
		//total sum=41,mul=91,copy=50

		double det=1/v9;
		m00=v2*det;
		m01=-v11*det;
		m02=v18*det;
		m03=-v27*det;
		m10=-v5*det;
		m11=v12*det;
		m12=-v21*det;
		m13=v30*det;
		m20=v7*det;
		m21=-v13*det;
		m22=v22*det;
		m23=-v31*det;
		m30=-v8*det;
		m31=v14*det;
		m32=-v23*det;
		m33=v32*det;
		//total sum=41,mul=91,copy=50
		return det;
	}
	public void init(){
		m00=0;
		m01=1;
		m02=1;
		m03=2;
		m10=0;
		m11=0;
		m12=100;
		m13=4;
		m20=2;
		m21=0;
		m22=1;
		m23=0;
		m30=1;
		m31=3;
		m32=2;
		m33=1;
		
	}
	public static void main(String[] args){
		Mat4x4 m=new Mat4x4();
		m.init();
		m.invers();
	}
}

//57ms