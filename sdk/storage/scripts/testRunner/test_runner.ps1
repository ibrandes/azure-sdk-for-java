
<# 
.NAME
    test runner

#>

Add-Type -AssemblyName System.Windows.Forms
[System.Windows.Forms.Application]::EnableVisualStyles()

$currentPackage = ""
$currentFile = ""
$currentTest = ""

$sdkLocation = ""

$dt = New-Object System.Data.DataTable

$TestRunner                      = New-Object system.Windows.Forms.Form
$TestRunner.ClientSize           = New-Object System.Drawing.Point(500,350)
$TestRunner.StartPosition        = [System.Windows.Forms.FormStartPosition]::CenterScreen
$TestRunner.text                 = "Test Runner"
$TestRunner.TopMost              = $false
$TestRunner.BackColor            = [System.Drawing.ColorTranslator]::FromHtml("#212325")
$TestRunner.Add_Load({startup})

$packageComboBox                 = New-Object system.Windows.Forms.ComboBox
$packageComboBox.text            = "no package selected"
$packageComboBox.width           = 300
$packageComboBox.height          = 30
$packageComboBox.location        = New-Object System.Drawing.Point(25,30)
$packageComboBox.AutoCompleteMode = [System.Windows.Forms.AutoCompleteMode]::SuggestAppend
$packageComboBox.AutoCompleteSource = [System.Windows.Forms.AutoCompleteSource]::ListItems
$packageComboBox.add_SelectedIndexChanged({packageSelection})

$fileComboBox                    = New-Object system.Windows.Forms.ComboBox
$fileComboBox.text               = "no file selected"
$fileComboBox.width              = 300
$fileComboBox.height             = 30
$fileComboBox.location           = New-Object System.Drawing.Point(25,80)
$fileComboBox.AutoCompleteMode   = [System.Windows.Forms.AutoCompleteMode]::SuggestAppend
$fileComboBox.AutoCompleteSource = [System.Windows.Forms.AutoCompleteSource]::ListItems
$fileComboBox.add_SelectedIndexChanged({fileSelection})

$testComboBox                    = New-Object system.Windows.Forms.ComboBox
$testComboBox.text               = "no test selected"
$testComboBox.width              = 300
$testComboBox.height             = 30
$testComboBox.location           = New-Object System.Drawing.Point(25,130)
$testComboBox.AutoCompleteMode   = [System.Windows.Forms.AutoCompleteMode]::SuggestAppend
$testComboBox.AutoCompleteSource = [System.Windows.Forms.AutoCompleteSource]::ListItems
$testComboBox.add_SelectedIndexChanged({testSelection})

$packageClearButton              = New-Object system.Windows.Forms.Button
$packageClearButton.text         = "Clear Package"
$packageClearButton.width        = 130
$packageClearButton.height       = 25
$packageClearButton.location     = New-Object System.Drawing.Point(330,29)
$packageClearButton.Font         = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$packageClearButton.ForeColor    = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")
$packageClearButton.BackColor    = [System.Drawing.ColorTranslator]::FromHtml("#4c4f88")
$packageClearButton.add_click({clearComboBoxSelection -comboBox "package"})

$fileClearButton                 = New-Object system.Windows.Forms.Button
$fileClearButton.text            = "Clear File"
$fileClearButton.width           = 130
$fileClearButton.height          = 25
$fileClearButton.location        = New-Object System.Drawing.Point(330,79)
$fileClearButton.Font            = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$fileClearButton.ForeColor       = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")
$fileClearButton.BackColor       = [System.Drawing.ColorTranslator]::FromHtml("#4c4f88")
$fileClearButton.add_click({clearComboBoxSelection -comboBox "file"})

$testClearButton                 = New-Object system.Windows.Forms.Button
$testClearButton.text            = "Clear Test"
$testClearButton.width           = 130
$testClearButton.height          = 25
$testClearButton.location        = New-Object System.Drawing.Point(330,129)
$testClearButton.Font            = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$testClearButton.ForeColor       = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")
$testClearButton.BackColor       = [System.Drawing.ColorTranslator]::FromHtml("#4c4f88")
$testClearButton.add_click({clearComboBoxSelection -comboBox "test"})

$liveRadio                       = New-Object system.Windows.Forms.RadioButton
$liveRadio.text                  = "LIVE"
$liveRadio.AutoSize              = $true
$liveRadio.location              = New-Object System.Drawing.Point(0,0)
$liveRadio.Font                  = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$liveRadio.ForeColor             = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")
$liveRadio.Checked               = $true

$recordRadio                     = New-Object system.Windows.Forms.RadioButton
$recordRadio.text                = "RECORD"
$recordRadio.AutoSize            = $true
$recordRadio.location            = New-Object System.Drawing.Point(64,0)
$recordRadio.Font                = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$recordRadio.ForeColor           = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")

$playbackRadio                   = New-Object system.Windows.Forms.RadioButton
$playbackRadio.text              = "PLAYBACK"
$playbackRadio.AutoSize          = $true
$playbackRadio.location          = New-Object System.Drawing.Point(165,0)
$playbackRadio.Font              = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$playbackRadio.ForeColor         = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")

$radioPanel                      = New-Object system.Windows.Forms.Panel
$radioPanel.height               = 20
$radioPanel.width                = 278
$radioPanel.location             = New-Object System.Drawing.Point(25,173)

$debugCheckBox                   = New-Object system.Windows.Forms.CheckBox
$debugCheckBox.text              = "Debug"
$debugCheckBox.AutoSize          = $true
$debugCheckBox.location          = New-Object System.Drawing.Point(25,205)
$debugCheckBox.Font              = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$debugCheckBox.ForeColor         = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")

$fiddlerCheckBox                  = New-Object system.Windows.Forms.CheckBox
$fiddlerCheckBox.text             = "Enable Fiddler"
$fiddlerCheckBox.AutoSize         = $true
$fiddlerCheckBox.location         = New-Object System.Drawing.Point(105,205)
$fiddlerCheckBox.Font             = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$fiddlerCheckBox.ForeColor        = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")

$refreshButton                    = New-Object system.Windows.Forms.Button
$refreshButton.text               = "Refresh files"
$refreshButton.AutoSize           = $true
$refreshButton.location           = New-Object System.Drawing.Point(25,240)
$refreshButton.Font               = New-Object System.Drawing.Font('Microsoft Sans Serif',12)
$refreshButton.ForeColor          = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")
$refreshButton.BackColor          = [System.Drawing.ColorTranslator]::FromHtml("#4c4f88")
$refreshButton.add_click({refresh})

$runButton                         = New-Object system.Windows.Forms.Button
$runButton.text                    = "Run"
$runButton.AutoSize                = $true
$runButton.location                = New-Object System.Drawing.Point(25,275)
$runButton.Font                    = New-Object System.Drawing.Font('Microsoft Sans Serif',12,[System.Drawing.FontStyle]([System.Drawing.FontStyle]::Bold))
$runButton.ForeColor               = [System.Drawing.ColorTranslator]::FromHtml("#ffffff")
$runButton.BackColor               = [System.Drawing.ColorTranslator]::FromHtml("#4c4f88")
$runButton.add_click({runTest})

function clearComboBoxSelection {
    param (
        $comboBox
    )
    if ($comboBox -eq "package") {
        $packageComboBox.SelectedIndex = -1
        $packageComboBox.text = "no package selected"
        $global:currentPackage = ""
    }
    if ($comboBox -eq "file") {
        $fileComboBox.SelectedIndex = -1
        $fileComboBox.text = "no file selected"
        $global:currentFile = ""
    }
    if ($comboBox -eq "test") {
        $testComboBox.SelectedIndex = -1
        $testComboBox.text = "no test selected"
        $global:currentTest = ""
    }
}

function packageSelection {
    $global:currentPackage = $packageComboBox.SelectedItem
    populateFiles -package $packageComboBox.SelectedItem
}

function populateFiles {
    param (
        $package
    )
    $fileComboBox.Items.Clear()
    $entriesWithPackage = $dt | Select-Object Package, TestFile | Where-Object Package -eq $package
    $files = $entriesWithPackage | Select-Object TestFile -unique

    ForEach ($file in $files) {
        $fileComboBox.Items.Add($file.TestFile)
    }
}

function fileSelection {
    $global:currentFile = $fileComboBox.SelectedItem
    populateTests -file $fileComboBox.SelectedItem
}

function populateTests {
    param (
        $file
    )
    $testComboBox.Items.Clear()
    $tests = $dt | Select-Object Package, TestFile, Test | Where-Object { $_.Package -eq $global:currentPackage -and $_.TestFile -eq $file }

    ForEach ($test in $tests) {
        $testComboBox.Items.Add($test.Test)
    }
}

function testSelection {
    $global:currentTest = $testComboBox.SelectedItem
}

function startup {
    $fullPath = Split-Path -parent $PSCommandPath
    $global:sdkLocation = $fullPath -split "(?<=\\azure-sdk-for-java)" | Select-Object -First 1

    $dt.Columns.Add("Package")
    $dt.Columns.Add("TestFile")
    $dt.Columns.Add("Test")
    $dt.CaseSensitive = $false

    refresh
}

function refresh {
    $packageComboBox.Items.Clear()
    $fileComboBox.Items.Clear()
    $testComboBox.Items.Clear()
    $dt.Clear()

    $storagePath = $global:sdkLocation + "\sdk\storage\"
    $testFolderPath = "\src\test\java"

    $packages = Get-ChildItem $storagePath -Directory -Exclude microsoft-azure*,*-stress,*-perf,scripts

    $packageNames = @()
    ForEach ($package in $packages) {
        $packageNames += $package.Name
        #refresh package objs
        $packageComboBox.Items.Add($package.Name)
    }

    $allFiles = ForEach($package in $packageNames) {
        $testsInPackage = Get-ChildItem -Path "$($storagePath)$($package)$($testFolderPath)" -File -Recurse
        
        ForEach($testFile in $testsInPackage) {
            #skipping testbases and things without test in them
            if($testFile.Name -Match "TestBase" -or -not($testFile.Name -Match "Test")) {
                continue
            }
            $trimmedName = $testFile.Name.Replace(".java","")
            #create test file object
            [pscustomobject]@{
                packageName = $package
                testFileName = $trimmedName
                testFilePath = $testFile.FullName
            }
        }
    }

    $regex = "public void (\w+) *\(([^)]*)\) *\{"
    ForEach($test in $allFiles) {
        $fileContent = Get-Content -Path $test.testFilePath
        $foundMethods = [regex]::Matches($fileContent, $regex)
        ForEach($method in $foundMethods) {
            #skipping commented out tests
            if($method -Match "//") {
                continue
            }

            #formatting
            $parameters = $method.Groups[2].Value -replace '\s+', ' '
            $method = $method.Groups[1].Value + "(" + $parameters + ")"

            #add to table
            $dt.Rows.Add($test.packageName, $test.testFileName, $method)
        }
    }

    if($global:currentPackage -ne "") {
        populateFiles -package $global:currentPackage
    }

    if($global:currentFile -ne "") {
        populateTests -file $global:currentFile
    }
}

function runTest {
    $testCommandResults = buildTestCommand
    $command = "Start-Process pwsh -ArgumentList `"-noexit`", `"-command $testCommandResults`""
    Write-Host $command
    Invoke-Expression($command)
}

function buildTestCommand {
    $mode = ""
    if ($liveRadio.Checked) {
        $mode = "LIVE"
    }
    if ($recordRadio.Checked) {
        $mode = "RECORD"
    }
    if ($playbackRadio.Checked) {
        $mode = "PLAYBACK"
    }

    $pomPath = ""
    $dTest = ""
    $debugEnabled = ""
    $fiddlerEnabled = ""

    if($debugCheckBox.Checked) {
        $debugEnabled = " -Dmaven.surefire.debug"
    }
    if($fiddlerCheckBox.Checked) {
        $fiddlerEnabled = " -DHTTP_PROXY=http://localhost:8888"
    }

    if ($global:currentPackage) {
        $pomPath = $global:sdkLocation + "\sdk\storage\" + $global:currentPackage + "\pom.xml"
    } else {
        $pomPath = $global:sdkLocation + "\sdk\storage\pom.xml"
    }

    $testTrimmed = $global:currentTest -replace '\(.*?\)', ''
    if ($global:currentFile -and $global:currentTest) {
        $dTest = "-Dtest=" + $global:currentFile + "#" + $testTrimmed
    }
    if ($global:currentFile -and (-not $global:currentTest)) {
        $dTest = "-Dtest=" + $global:currentFile
    }

    $command = "mvn --% -f " + $pomPath + " " + $dTest + " -DAZURE_TEST_MODE=" + $mode + $debugEnabled + $fiddlerEnabled + " test"
    Write-Host $command
    return $command
}

$radioPanel.controls.AddRange(@($liveRadio,$recordRadio,$playbackRadio))
$TestRunner.controls.AddRange(@($packageComboBox,$fileComboBox,$testComboBox,$packageClearButton,$fileClearButton,$testClearButton,$radioPanel,$debugCheckBox,$fiddlerCheckBox,$runButton,$refreshButton))

try{
    [void]$TestRunner.ShowDialog()
} finally {
    $TestRunner.Dispose()
}