// $LastChangedRevision$ DO NOT EDIT.  Make changes to ${entity.classNameWithOptionalPackage}.java instead.
#if ($entity.superclassPackageName)
package $entity.superclassPackageName

#end
import com.webobjects.eoaccess.EOUtilities
import com.webobjects.eocontrol._
import com.webobjects.foundation._
import er.extensions.eof._
import org.apache.log4j.Logger

import scala.collection.JavaConversions._
import $entity.className
#foreach ($relationship in $entity.sortedClassToOneRelationships)
#if ($relationship.actualDestination.classNameWithDefault != "EOGenericRecord" && $relationship.actualDestination.packageName != $entity.superclassPackageName)
import $relationship.actualDestination.classNameWithDefault
#end
#end
#foreach ($relationship in $entity.sortedClassToManyRelationships)
#if ($relationship.actualDestination.classNameWithDefault != "EOGenericRecord" && $relationship.actualDestination.packageName != $entity.superclassPackageName)
import $relationship.actualDestination.classNameWithDefault
#end
#end

object ${entity.classNameWithoutPackage}Path extends ${entity.classNameWithoutPackage}Path("") {}

class ${entity.classNameWithoutPackage}Path(override val key: String) extends ERXKey[${entity.classNameWithoutPackage}](key: String) {
#foreach ($attribute in $entity.sortedClassAttributes)
#if ($attribute.name != "type")
  def ${attribute.name} = this.append(${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName})
#else
  def ${attribute.name}Key = this.append(${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName})  
#end
#end

#foreach ($relationship in $entity.sortedClassRelationships)
#if ($relationship.actualDestination.classNameWithDefault != "EOGenericRecord")
#if ($relationship.name != "type")
  def ${relationship.name} = new ${relationship.actualDestination.classNameWithoutPackage}Path(this.append(${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}).key)
#else
  def ${relationship.name}Key = new ${relationship.actualDestination.classNameWithoutPackage}Path(this.append(${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}).key)
#end
#end
#end	
}

trait ${entity.classNameWithoutPackage}Trait {
#if ($entity.partialEntitySet)
  val ENTITY_NAME = "$entity.partialEntity.name"
#else
  val ENTITY_NAME = "$entity.name"
#end

  // Attributes
#foreach ($attribute in $entity.sortedClassAttributes)
#if ($attribute.javaClassName != "java.math.BigDecimal")
  val ${attribute.uppercaseUnderscoreName} = new ERXKey[$attribute.javaClassName]("$attribute.name")
#else
  val ${attribute.uppercaseUnderscoreName} = new ERXKey[scala.math.BigDecimal]("$attribute.name")
#end
#end

  // Relationships
#foreach ($relationship in $entity.sortedClassRelationships)
  val ${relationship.uppercaseUnderscoreName} = new ERXKey[$relationship.actualDestination.classNameWithDefault]("$relationship.name");
  //val ${relationship.uppercaseUnderscoreName}.key = ${relationship.uppercaseUnderscoreName}.key
#end

  def apply(editingContext: EOEditingContext) = {
	val result = new ${entity.classNameWithOptionalPackage}()
	editingContext.insertObject(result)
	result
  }
  
#if ($entity.parentSet)
  def fetchSpecFor${entity.name}: ERXFetchSpecification[${entity.classNameWithOptionalPackage}] = {
    new ERXFetchSpecification[${entity.classNameWithOptionalPackage}](ENTITY_NAME, null, null, false, true, null)
  }
#else
  def fetchSpec: ERXFetchSpecification[${entity.classNameWithOptionalPackage}] = {
    new ERXFetchSpecification[${entity.classNameWithOptionalPackage}](ENTITY_NAME, null, null, false, true, null)
  }
#end

  def fetchAll${entity.pluralName}(editingContext: EOEditingContext): NSArray[${entity.classNameWithOptionalPackage}] = {
    fetchAll${entity.pluralName}(editingContext, null)
  }

  def fetchAll${entity.pluralName}(editingContext: EOEditingContext, sortOrderings: NSArray[EOSortOrdering]): NSArray[${entity.classNameWithOptionalPackage}] = {
    fetch${entity.pluralName}(editingContext, null, sortOrderings)
  }

  def fetch${entity.pluralName}(editingContext: EOEditingContext, qualifier: EOQualifier, sortOrderings: NSArray[EOSortOrdering]): NSArray[${entity.classNameWithOptionalPackage}] = {
    val fetchSpec = new ERXFetchSpecification[${entity.classNameWithOptionalPackage}](ENTITY_NAME, qualifier, sortOrderings)
    fetchSpec.setIsDeep(true)
    val eoObjects = fetchSpec.fetchObjects(editingContext)
    return eoObjects
  }

  def fetch${entity.name}(editingContext: EOEditingContext, keyName: String, value: AnyRef): ${entity.classNameWithOptionalPackage} = {
    fetch${entity.name}(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value))
  }

  def fetch${entity.name}(editingContext: EOEditingContext, qualifier: EOQualifier): ${entity.classNameWithOptionalPackage} = {
    val eoObjects = fetch${entity.pluralName}(editingContext, qualifier, null)
    val count = eoObjects.count()
    val eoObject = 
      if (count == 0) {
        null
      } else if (count == 1) {
        eoObjects.objectAtIndex(0);
      } else {
        throw new IllegalStateException("There was more than one ${entity.name} that matched the qualifier '" + qualifier + "'.")
      }
    eoObject
  }

  def fetchRequired${entity.name}(editingContext: EOEditingContext, keyName: String, value: AnyRef): ${entity.classNameWithOptionalPackage} = {
    return fetchRequired${entity.name}(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value))
  }

  def fetchRequired${entity.name}(editingContext: EOEditingContext, qualifier: EOQualifier): ${entity.classNameWithOptionalPackage} = {
    val eoObject = fetch${entity.name}(editingContext, qualifier)
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ${entity.name} that matched the qualifier '" + qualifier + "'.")
    }
    eoObject
  }

  def localInstanceIn(editingContext: EOEditingContext, eo: ${entity.classNameWithOptionalPackage}): ${entity.classNameWithOptionalPackage} = {
    val localInstance = if (eo == null) null else ERXEOControlUtilities.localInstanceOfObject(editingContext, eo)
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.")
    }
    localInstance
  }
  
#foreach ($fetchSpecification in $entity.sortedFetchSpecs)
#if (true || $fetchSpecification.distinctBindings.size() > 0)
  def fetch${fetchSpecification.capitalizedName}(editingContext: EOEditingContext, bindings: NSDictionary[String, AnyRef]): NSArray#if ($fetchSpecification.fetchEnterpriseObjects)[${entity.className}]#else[NSDictionary[String, AnyRef]]#end = {
    val fetchSpec = EOFetchSpecification.fetchSpecificationNamed("${fetchSpecification.name}", ENTITY_NAME)
    val boundFetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings)
    editingContext.objectsWithFetchSpecification(boundFetchSpec).asInstanceOf[NSArray#if ($fetchSpecification.fetchEnterpriseObjects)[${entity.className}]#else[NSDictionary[String, AnyRef]]#end]
  }
  
#end
  def fetch${fetchSpecification.capitalizedName}(editingContext: EOEditingContext#foreach ($binding in $fetchSpecification.distinctBindings),
	${binding.name}Binding: ${binding.attributePath.childClassName} #end): NSArray#if ($fetchSpecification.fetchEnterpriseObjects)[${entity.className}]#else[NSDictionary[String, AnyRef]]#end = {
 
    var fetchSpec = EOFetchSpecification.fetchSpecificationNamed("${fetchSpecification.name}", ENTITY_NAME)
#if ($fetchSpecification.distinctBindings.size() > 0)
    val bindings = new NSMutableDictionary[String, AnyRef]()
#foreach ($binding in $fetchSpecification.distinctBindings)
    bindings.takeValueForKey(${binding.name}Binding, "${binding.name}")
#end
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
#end
    return editingContext.objectsWithFetchSpecification(fetchSpec).asInstanceOf[(NSArray#if ($fetchSpecification.fetchEnterpriseObjects)[${entity.className}]#else[NSDictionary[String, AnyRef]]#end)]
  }
#end
}

abstract class ${entity.prefixClassNameWithoutPackage} extends#if ($entity.parentClassNameSet)${entity.parentClassName}#elseif ($entity.partialEntitySet)er.extensions.partials.ERXPartial<${entity.partialEntity.className}>#elseif ($entity.parentSet)${entity.parent.classNameWithDefault}#elseif ($EOGenericRecord)${EOGenericRecord}#else EOGenericRecord#end {
  private lazy val logger = Logger.getLogger(this.getClass.getName)

#if (!$entity.partialEntitySet)
  def localInstanceIn(editingContext: EOEditingContext): $entity.classNameWithOptionalPackage = {
    val localInstance = EOUtilities.localInstanceOfObject(editingContext, this).asInstanceOf[($entity.classNameWithOptionalPackage)]
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.")
    }
    return localInstance
  }

#end
#foreach ($attribute in $entity.sortedClassAttributes)
#if (!$attribute.inherited)
#if ($attribute.userInfo.ERXConstantClassName)
#if ($attribute.name != "type")
  def ${attribute.name}: $attribute.userInfo.ERXConstantClassName = {
#else
  def get${attribute.capitalizedName}: $attribute.userInfo.ERXConstantClassName = {
#end
    storedValueForKey(${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName}.key)
  }

#if ($attribute.allowsNull)
#if ($attribute.name != "type")
  def ${attribute.name}Option: Option[$attribute.userInfo.ERXConstantClassName] = {
	Option(${attribute.name})
  }
  
#else
  def get${attribute.capitalizedName}Option: Option[$attribute.userInfo.ERXConstantClassName] = {
	Option(get${attribute.capitalizedName})
  }
  
#end
#end
  def set${attribute.capitalizedName}(value: $attribute.userInfo.ERXConstantClassName) = {
    takeStoredValueForKey(value, ${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName}.key)
  }
  
  def ${attribute.name}_=(value: $attribute.userInfo.ERXConstantClassName) = {
	set${attribute.capitalizedName}(value) 
  }
#else
#if ($attribute.name != "type")
  def ${attribute.name} = {
#else
  def get${attribute.capitalizedName} = {
#end
#if ($attribute.javaClassName != "java.math.BigDecimal")
    storedValueForKey(${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName}.key).asInstanceOf[$attribute.getJavaClassName(true)]
#else
	val javaBD = storedValueForKey(${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName}.key).asInstanceOf[$attribute.getJavaClassName(true)]
    if (javaBD != null) scala.math.BigDecimal(javaBD) else null                                                                                                                      
#end
  }

#if ($attribute.allowsNull)
#if ($attribute.name != "type")
  def ${attribute.name}Option = {
	Option(${attribute.name})
  }
  
#else
  def get${attribute.capitalizedName}Option = {
	Option(get${attribute.capitalizedName})
  }
  
#end  
#end
#if ($attribute.javaClassName != "java.math.BigDecimal")
  def set${attribute.capitalizedName}(value: $attribute.javaClassName) {
   	logger.debug( "updating $attribute.name from " + #if ($attribute.name != "type") ${attribute.name} #else get${attribute.capitalizedName} #end + " to " + value)
    takeStoredValueForKey(value, ${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName}.key)
  }
#else
  def set${attribute.capitalizedName}(value: scala.math.BigDecimal) {
   	logger.debug( "updating $attribute.name from " + #if ($attribute.name != "type") ${attribute.name} #else get${attribute.capitalizedName} #end + " to " + value)
    takeStoredValueForKey(if (value != null) value.bigDecimal else null, ${entity.classNameWithoutPackage}.${attribute.uppercaseUnderscoreName}.key)
  }	
#end
#if ($attribute.javaClassName != "java.math.BigDecimal")
  def ${attribute.name}_=(value: $attribute.javaClassName) = {
#else
  def ${attribute.name}_=(value: scala.math.BigDecimal) = {
#end
	set${attribute.capitalizedName}(value) 
  }
#end

#end
#end
#foreach ($relationship in $entity.sortedClassToOneRelationships)
#if (!$relationship.inherited) 
  def ${relationship.name}: $relationship.actualDestination.classNameWithoutPackage = {
    storedValueForKey(${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key).asInstanceOf[$relationship.actualDestination.classNameWithoutPackage]
  }

#if ($relationship.optional)
  def ${relationship.name}Option: Option[$relationship.actualDestination.classNameWithoutPackage] = {
    Option(${relationship.name})
  }
  
#end
  def set${relationship.capitalizedName}Relationship(value: $relationship.actualDestination.classNameWithoutPackage) = {
    logger.debug("updating $relationship.name from " + ${relationship.name} + " to " + value)
    if (value == null) {
    	val oldValue: EORelationshipManipulation = ${relationship.name}.asInstanceOf[EORelationshipManipulation]
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, ${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key)
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, ${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key)
    }
  }

  def ${relationship.name}_=(value: $relationship.actualDestination.classNameWithoutPackage) = {
	set${relationship.capitalizedName}Relationship(value) 
  }
    
#end
#end
#foreach ($relationship in $entity.sortedClassToManyRelationships)
#if (!$relationship.inherited) 
  def ${relationship.name} = {
    storedValueForKey(${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key).asInstanceOf[NSArray[${relationship.actualDestination.classNameWithoutPackage}]]
  }
  
  def addTo${relationship.capitalizedName}Relationship(eo: $relationship.actualDestination.classNameWithoutPackage) = {
    logger.debug("adding " + eo + " to ${relationship.name} relationship")
    addObjectToBothSidesOfRelationshipWithKey(eo, ${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key)
  }

  def removeFrom${relationship.capitalizedName}Relationship(eo: $relationship.actualDestination.classNameWithoutPackage) = {
    logger.debug("removing " + eo + " from ${relationship.name} relationship")
    removeObjectFromBothSidesOfRelationshipWithKey(eo, ${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key)
  }

  def create${relationship.capitalizedName}Relationship(): $relationship.actualDestination.classNameWithDefault = {
    val eoClassDesc = EOClassDescription.classDescriptionForEntityName(#if(${relationship.actualDestination.genericRecord})"${relationship.actualDestination.name}"#else ${relationship.actualDestination.classNameWithDefault}.ENTITY_NAME #end)
    val eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null)
    editingContext().insertObject(eo)
    addObjectToBothSidesOfRelationshipWithKey(eo, ${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key)
    return eo.asInstanceOf[$relationship.actualDestination.classNameWithDefault]
  }
  
  def delete${relationship.capitalizedName}Relationship(eo: $relationship.actualDestination.classNameWithoutPackage) = {
    removeObjectFromBothSidesOfRelationshipWithKey(eo, ${entity.classNameWithoutPackage}.${relationship.uppercaseUnderscoreName}.key)
#if (!$relationship.ownsDestination)
    editingContext.deleteObject(eo)
#end
  }
  
  def deleteAll${relationship.capitalizedName}Relationships() = {
    val objects = ${relationship.name}.immutableClone.objectEnumerator
    while (objects.hasMoreElements) {
      delete${relationship.capitalizedName}Relationship(objects.nextElement)
    }
  }
#end
#end

}
