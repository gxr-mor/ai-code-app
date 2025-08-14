package com.gxr.codegenerate.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

@Data
public class MultiFileCodeResult {
    @Description("HTML代码")
    private String htmlCode;
    @Description("CSS代码")
    private String cssCode;
    @Description("JS代码")
    private String jsCode;
    @Description("HTML代码的描述")
    private String description;
}
