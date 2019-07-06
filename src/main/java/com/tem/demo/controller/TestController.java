package com.tem.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tem.demo.common.RespData;
import com.tem.demo.model.User;

@Controller
@RequestMapping("/product")
@Api(value = "TestSwagger注解的控制器")
public class TestController {

    @ResponseBody
    @RequestMapping(value ="/getUserName", method= RequestMethod.GET)
    @ApiOperation(value="根据用户编号获取用户姓名")
    public String getUserName(@RequestParam Integer userNumber,Model model){
    	 
    	if(userNumber == 1){
    		User user = new User();
            user.setName("李四");
            model.addAttribute("user",user );
            return "success";
        }
        else if(userNumber == 2){
            return "fail";
        }
        else{
            return "other";
        }
       
        
    }

    
    
    
    @ResponseBody
    @RequestMapping(value="/queryUser",method=RequestMethod.POST)
    public RespData<User> queryUser(@RequestParam("userId") String userId){
        User user = new User();
        user.setName("张三");
        user.setId(Long.parseLong(userId));
        return new RespData<User>(HttpStatus.OK.value(), user,"响应成功");
    }
}


