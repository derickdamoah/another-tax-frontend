/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.anothertaxfrontend.controllers

import play.api.http.Status
import play.api.libs.json.Json
import play.api.test.Helpers._

class PageNotFoundViewControllerSpec extends ControllerSpecBase  {
  private val controller = inject[PageNotFoundViewController]

  "PageNotFoundController" when {

    "calling pageNotFound()" must {

      "return status code 200 (Ok) " in {
        val result = controller.pageNotFound(fakeRequest)
        status(result) mustBe Status.OK
      }


      "return HTML" in {
        val result = controller.pageNotFound(fakeRequest)
        contentType(result) mustBe Some("text/html")
        charset(result) mustBe Some("utf-8")
        contentAsString(result) must include ("Page not found")
      }

    }

  }

}
