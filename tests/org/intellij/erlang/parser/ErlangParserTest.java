/*
 * Copyright 2012 Sergey Ignatov
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

package org.intellij.erlang.parser;

import com.intellij.testFramework.ParsingTestCase;
import org.intellij.erlang.ErlangParserDefinition;

/**
 * @author ignatov
 */
public class ErlangParserTest extends ParsingTestCase {
  public ErlangParserTest() {
    super("parser", "erl", new ErlangParserDefinition());
  }

  @Override
  protected String getTestDataPath() {
    return "testData";
  }

  @Override
  protected boolean skipSpaces() {
    return true;
  }

  public void testHelloWorld()        { doTest(true, false); }
  public void testExport()            { doTest(true, false); }
  public void testH()                 { doTest(true, false); }
  public void testMnesia()            { doTest(true, false); }
  public void testIsDigits()          { doTest(true, false); }
  public void testDialyzerDataflow()  { doTest(true, false); }
  public void testTest()              { doTest(true, false); }
  public void testRecords()           { doTest(true, false); }
  public void testDialyzerClParse()   { doTest(true, false); }
  public void testMp4Mux()            { doTest(true, false); }
  public void testComments()          { doTest(true, false); }
  public void testMultiline()         { doTest(true, false); }
  public void testRecordExpression()  { doTest(true, false); }
  public void testPeriods()           { doTest(true, true); }
  public void test19()                { doTest(true, true); }

  protected void doTest(boolean checkResult, boolean suppressErrors) {
//    OVERWRITE_TESTDATA = true;

    super.doTest(checkResult);
    if (!suppressErrors) {
      assertFalse(
        "PsiFile contains error elements",
        toParseTreeText(myFile, skipSpaces(), includeRanges()).contains("PsiErrorElement")
      );
    }
  }
}

