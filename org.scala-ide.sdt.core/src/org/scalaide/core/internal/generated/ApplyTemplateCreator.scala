/*
 * This file is automatically generated by `org.scalaide.core.internal.extensions.ExtensionGenerator`, do not edit it!
 * If changes are needed, fix the generator.
 *
 * File generated at: Tue Feb 23 01:03:29 CET 2016
 */
package org.scalaide.core.internal.generated
class ApplyTemplateCreator {
  def create(doc: org.scalaide.core.text.Document, change: org.scalaide.core.text.TextChange): org.scalaide.extensions.autoedits.ApplyTemplate =
    new org.scalaide.extensions.autoedits.ApplyTemplate {
      override val document: org.scalaide.core.text.Document = doc
      override val textChange: org.scalaide.core.text.TextChange = change
    }
}