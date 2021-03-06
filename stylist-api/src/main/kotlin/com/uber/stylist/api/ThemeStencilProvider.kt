/*
 * Copyright (c) 2018. Uber Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.stylist.api

/**
 * This interface should be implemented in order to provide theme definitions to Stylist.
 */
interface ThemeStencilProvider {

  /**
   * Provide a set of [ThemeStencils][ThemeStencil] to be used during code generation.
   *
   * @return The set of [ThemeStencils][ThemeStencil].
   */
  fun stencils(): Set<ThemeStencil>

  /**
   * Provide a set of [StyleItemGroups][StyleItemGroup] that should be applied to all [ThemeStencils][ThemeStencil].
   *
   * @return The set of [StyleItemGroups][StyleItemGroup].
   */
  fun globalStyleItemGroups(): Set<StyleItemGroup>
}
