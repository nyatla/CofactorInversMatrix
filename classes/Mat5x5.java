class Mat5x5{
	public double m00,m01,m02,m03,m04;
	public double m10,m11,m12,m13,m14;
	public double m20,m21,m22,m23,m24;
	public double m30,m31,m32,m33,m34;
	public double m40,m41,m42,m43,m44;
	public double invers(){
		double a00=m00,a01=m01,a02=m02,a03=m03,a04=m04;
		double a10=m10,a11=m11,a12=m12,a13=m13,a14=m14;
		double a20=m20,a21=m21,a22=m22,a23=m23,a24=m24;
		double a30=m30,a31=m31,a32=m32,a33=m33,a34=m34;
		double a40=m40,a41=m41,a42=m42,a43=m43,a44=m44;
		double v0=(a33*a44-a34*a43);//34-34
		double v1=(a32*a44-a34*a42);//34-24
		double v2=(a32*a43-a33*a42);//34-23
		double v4=(a31*a44-a34*a41);//34-14
		double v5=(a31*a43-a33*a41);//34-13
		double v7=(a31*a42-a32*a41);//34-12
		double v11=(a30*a44-a34*a40);//34-04
		double v12=(a30*a43-a33*a40);//34-03
		double v14=(a30*a42-a32*a40);//34-02
		double v18=(a30*a41-a31*a40);//34-01
		double v46=(a23*a44-a24*a43);//24-34
		double v47=(a22*a44-a24*a42);//24-24
		double v48=(a22*a43-a23*a42);//24-23
		double v50=(a21*a44-a24*a41);//24-14
		double v51=(a21*a43-a23*a41);//24-13
		double v53=(a21*a42-a22*a41);//24-12
		double v57=(a20*a44-a24*a40);//24-04
		double v58=(a20*a43-a23*a40);//24-03
		double v60=(a20*a42-a22*a40);//24-02
		double v64=(a20*a41-a21*a40);//24-01
		double v71=(a23*a34-a24*a33);//23-34
		double v72=(a22*a34-a24*a32);//23-24
		double v73=(a22*a33-a23*a32);//23-23
		double v75=(a21*a34-a24*a31);//23-14
		double v76=(a21*a33-a23*a31);//23-13
		double v78=(a21*a32-a22*a31);//23-12
		double v82=(a20*a34-a24*a30);//23-04
		double v83=(a20*a33-a23*a30);//23-03
		double v85=(a20*a32-a22*a30);//23-02
		double v89=(a20*a31-a21*a30);//23-01
		//lv2=30;mul=60,sum=30,copy=30
		double v3=a22*(v0)-a23*(v1)+a24*(v2);//234-234
		double v6=a21*(v0)-a23*(v4)+a24*(v5);//234-134
		double v8=a21*(v1)-a22*(v4)+a24*(v7);//234-124
		double v9=a21*(v2)-a22*(v5)+a23*(v7);//234-123
		double v13=a20*(v0)-a23*(v11)+a24*(v12);//234-034
		double v15=a20*(v1)-a22*(v11)+a24*(v14);//234-024
		double v16=a20*(v2)-a22*(v12)+a23*(v14);//234-023
		double v19=a20*(v4)-a21*(v11)+a24*(v18);//234-014
		double v20=a20*(v5)-a21*(v12)+a23*(v18);//234-013
		double v22=a20*(v7)-a21*(v14)+a22*(v18);//234-012
		double v31=a12*(v0)-a13*(v1)+a14*(v2);//134-234
		double v32=a11*(v0)-a13*(v4)+a14*(v5);//134-134
		double v33=a11*(v1)-a12*(v4)+a14*(v7);//134-124
		double v34=a11*(v2)-a12*(v5)+a13*(v7);//134-123
		double v36=a10*(v0)-a13*(v11)+a14*(v12);//134-034
		double v37=a10*(v1)-a12*(v11)+a14*(v14);//134-024
		double v38=a10*(v2)-a12*(v12)+a13*(v14);//134-023
		double v40=a10*(v4)-a11*(v11)+a14*(v18);//134-014
		double v41=a10*(v5)-a11*(v12)+a13*(v18);//134-013
		double v43=a10*(v7)-a11*(v14)+a12*(v18);//134-012
		double v49=a12*(v46)-a13*(v47)+a14*(v48);//124-234
		double v52=a11*(v46)-a13*(v50)+a14*(v51);//124-134
		double v54=a11*(v47)-a12*(v50)+a14*(v53);//124-124
		double v55=a11*(v48)-a12*(v51)+a13*(v53);//124-123
		double v59=a10*(v46)-a13*(v57)+a14*(v58);//124-034
		double v61=a10*(v47)-a12*(v57)+a14*(v60);//124-024
		double v62=a10*(v48)-a12*(v58)+a13*(v60);//124-023
		double v65=a10*(v50)-a11*(v57)+a14*(v64);//124-014
		double v66=a10*(v51)-a11*(v58)+a13*(v64);//124-013
		double v68=a10*(v53)-a11*(v60)+a12*(v64);//124-012
		double v74=a12*(v71)-a13*(v72)+a14*(v73);//123-234
		double v77=a11*(v71)-a13*(v75)+a14*(v76);//123-134
		double v79=a11*(v72)-a12*(v75)+a14*(v78);//123-124
		double v80=a11*(v73)-a12*(v76)+a13*(v78);//123-123
		double v84=a10*(v71)-a13*(v82)+a14*(v83);//123-034
		double v86=a10*(v72)-a12*(v82)+a14*(v85);//123-024
		double v87=a10*(v73)-a12*(v83)+a13*(v85);//123-023
		double v90=a10*(v75)-a11*(v82)+a14*(v89);//123-014
		double v91=a10*(v76)-a11*(v83)+a13*(v89);//123-013
		double v93=a10*(v78)-a11*(v85)+a12*(v89);//123-012
		//lv3=40;mul=120,sum=80,copy=40
		double v10=a11*(v3)-a12*(v6)+a13*(v8)-a14*(v9);//1234-1234
		double v17=a10*(v3)-a12*(v13)+a13*(v15)-a14*(v16);//1234-0234
		double v21=a10*(v6)-a11*(v13)+a13*(v19)-a14*(v20);//1234-0134
		double v23=a10*(v8)-a11*(v15)+a12*(v19)-a14*(v22);//1234-0124
		double v24=a10*(v9)-a11*(v16)+a12*(v20)-a13*(v22);//1234-0123
		double v26=a01*(v3)-a02*(v6)+a03*(v8)-a04*(v9);//0234-1234
		double v27=a00*(v3)-a02*(v13)+a03*(v15)-a04*(v16);//0234-0234
		double v28=a00*(v6)-a01*(v13)+a03*(v19)-a04*(v20);//0234-0134
		double v29=a00*(v8)-a01*(v15)+a02*(v19)-a04*(v22);//0234-0124
		double v30=a00*(v9)-a01*(v16)+a02*(v20)-a03*(v22);//0234-0123
		double v35=a01*(v31)-a02*(v32)+a03*(v33)-a04*(v34);//0134-1234
		double v39=a00*(v31)-a02*(v36)+a03*(v37)-a04*(v38);//0134-0234
		double v42=a00*(v32)-a01*(v36)+a03*(v40)-a04*(v41);//0134-0134
		double v44=a00*(v33)-a01*(v37)+a02*(v40)-a04*(v43);//0134-0124
		double v45=a00*(v34)-a01*(v38)+a02*(v41)-a03*(v43);//0134-0123
		double v56=a01*(v49)-a02*(v52)+a03*(v54)-a04*(v55);//0124-1234
		double v63=a00*(v49)-a02*(v59)+a03*(v61)-a04*(v62);//0124-0234
		double v67=a00*(v52)-a01*(v59)+a03*(v65)-a04*(v66);//0124-0134
		double v69=a00*(v54)-a01*(v61)+a02*(v65)-a04*(v68);//0124-0124
		double v70=a00*(v55)-a01*(v62)+a02*(v66)-a03*(v68);//0124-0123
		double v81=a01*(v74)-a02*(v77)+a03*(v79)-a04*(v80);//0123-1234
		double v88=a00*(v74)-a02*(v84)+a03*(v86)-a04*(v87);//0123-0234
		double v92=a00*(v77)-a01*(v84)+a03*(v90)-a04*(v91);//0123-0134
		double v94=a00*(v79)-a01*(v86)+a02*(v90)-a04*(v93);//0123-0124
		double v95=a00*(v80)-a01*(v87)+a02*(v91)-a03*(v93);//0123-0123
		//lv4=25;mul=100,sum=75,copy=25
		double v25=a00*(v10)-a01*(v17)+a02*(v21)-a03*(v23)+a04*(v24);//01234-01234
		//lv5=1;mul=5,sum=4,copy=1
		double det=1/v25;
		m00=v10*det;
		m01=-v26*det;
		m02=v35*det;
		m03=-v56*det;
		m04=v81*det;
		m10=-v17*det;
		m11=v27*det;
		m12=-v39*det;
		m13=v63*det;
		m14=-v88*det;
		m20=v21*det;
		m21=-v28*det;
		m22=v42*det;
		m23=-v67*det;
		m24=v92*det;
		m30=-v23*det;
		m31=v29*det;
		m32=-v44*det;
		m33=v69*det;
		m34=-v94*det;
		m40=v24*det;
		m41=-v30*det;
		m42=v45*det;
		m43=-v70*det;
		m44=v95*det;
		//total sum=189,mul=311,copy=122
		return det;
	}
}
