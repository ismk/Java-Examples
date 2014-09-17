<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : newstylesheet.xsl
    Created on : February 3, 2014, 10:22 AM
    Author     : Lab2
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>newstylesheet.xsl</title>
            </head>
            <body>
                <table border="1">
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>marks</th>
                    </tr>
                    <xsl:for-each select="studentdetails/student">
                    <xsl:sort select="marks"  data-type="number" order="ascending"/>
                    <tr>                  
 <td><xsl:value-of select="id"/></td>
   <td><xsl:value-of select="name"/></td>
             <xsl:if test="marks &gt; 34">
                 <td bgcolor="green"> 
                     <xsl:value-of select="marks"/>
                 </td>
             </xsl:if>
             <xsl:if test="marks &lt; 34">
                 <td bgcolor="red"> 
                     <xsl:value-of select="marks"/>
                 </td>
             </xsl:if>
                   <td> 
                 <xsl:value-of select="marks"/>
             </td>
                  </tr>
                </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
