#if ($entity.packageName)
package $entity.packageName
#end

import org.apache.log4j.Logger
import scala.collection.JavaConversions._

object ${entity.classNameWithoutPackage} extends ${entity.classNameWithoutPackage}Trait {
}

class ${entity.classNameWithoutPackage} extends ${entity.prefixClassNameWithoutPackage} {
  private lazy val logger = Logger.getLogger(this.getClass.getName)
}

