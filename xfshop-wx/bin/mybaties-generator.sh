#!/bin/bash

# @desc : 用于自动生成mybatis的相关文件
# @date : 2015-11-02 
# @author : Pigo.can

java=`which java`
 echo "################################"
 echo "* @author pigo.can "
 echo "* @email rushingpig@163.com"
 echo "* @homepage http://www.pigo.top "
 echo "* @ver V1.0 "
 echo "#################################"
 echo ""
 echo ""
 echo ""
 echo ""
 echo ""


 echo "开始生成mybatis相关文件，请稍后...."
 cd ../mybatis-generator
 #	此处是覆盖已有文件
${java} -jar mybatis-generator-core-1.3.2.jar  -configfile generatorConfig.xml -overwrite

echo "生成完毕 ！"

