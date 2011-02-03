/*
 * Copyright 2011 Jon S Akhtar (Sylvanaar)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sylvanaar.idea.Lua.lang.psi.stubs;

import com.intellij.psi.stubs.PsiFileStub;
import com.intellij.psi.stubs.PsiFileStubImpl;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.util.io.StringRef;
import com.sylvanaar.idea.Lua.lang.parser.LuaParserDefinition;
import com.sylvanaar.idea.Lua.lang.psi.LuaPsiFile;


public class LuaFileStub extends PsiFileStubImpl<LuaPsiFile> implements PsiFileStub<LuaPsiFile>
{
  private final StringRef myName;

  public LuaFileStub(LuaPsiFile file)
  {
    super(file);
    myName = StringRef.fromString(file.getName());
  }

  public LuaFileStub(StringRef name)
  {
    super(null);
    myName = name;
  }

  public IStubFileElementType getType()
  {
    return LuaParserDefinition.LUA_FILE;
  }


  public StringRef getName()
  {
    return myName;
  }

}