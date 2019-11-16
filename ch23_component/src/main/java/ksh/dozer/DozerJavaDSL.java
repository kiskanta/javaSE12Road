package ksh.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import ksh.pojo.AddressBean;
import ksh.pojo.AddressType;

public class DozerJavaDSL {
	public static void main(String[] args) {
		AddressType addrType=new AddressType();
    	addrType.setAddrLine1("121 Howard Lane");
    	addrType.setAddrLine2("APT 222");
		addrType.setCity("Austin");
		addrType.setState("Florida");
		addrType.setZipCode(32050);
		
		Mapper mapper = DozerBeanMapperBuilder.buildDefault();
		AddressBean addressBean = mapper.map(addrType, AddressBean.class);
		
		System.out.println(addressBean);
		
		
	}
}
