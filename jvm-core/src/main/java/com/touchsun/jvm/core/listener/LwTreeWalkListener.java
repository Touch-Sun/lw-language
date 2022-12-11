/**
 * MIT License
 * <p>
 * Copyright (c) 2022 TouchSun
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.touchsun.jvm.core.listener;

import com.touchsun.jvm.core.antlr.LwBaseListener;
import com.touchsun.jvm.core.antlr.LwParser;
import com.touchsun.jvm.core.command.Instruction;
import com.touchsun.jvm.core.model.Variable;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 语法解析树监听器
 * 
 * @author lee
 */
public class LwTreeWalkListener extends LwBaseListener {

    /**
     * 指令队列
     */
    Queue<Instruction> instructionQueue = new ArrayDeque<>();

    /**
     * 变量Map
     * key - 变量String值
     * value - 变量对象
     */
    Map<String, Variable> variableMap = new HashMap<>();

    public Queue<Instruction> getInstructionQueue() {
        return instructionQueue;
    }
    
    @Override
    public void exitVariable(LwParser.VariableContext ctx) {
        // 变量名称
        final TerminalNode varName = ctx.ID();
        // 获取变量值
        final LwParser.ValueContext varValue = ctx.value();
        // 变量类型
        final int varType = varValue.getStart().getType();
        // 变量索引
        final int varIndex = variableMap.size();
        // 变量的String值
        final String varText = varValue.getText();
        // 实例化一个变量对象
        Variable variable = new Variable(varIndex, varType, varText);
        // 加入到变量Map
        variableMap.put(varText, variable);
        // 输出信息
        logVariableDeclarationStatementFound(varName, varValue);
    }
    
    private void logVariableDeclarationStatementFound(TerminalNode varName, LwParser.ValueContext varValue) {
        // 获取行数
        final int line = varName.getSymbol().getLine();
        // 输出信息
        final String format = "OK：您第“%s”行声明了名为“%s”值为“%s”的变量。\\n";
        System.out.printf(format, line, varName, varValue);
    }
}
















