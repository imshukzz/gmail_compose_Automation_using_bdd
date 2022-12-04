Feature: Compose Function of Gmail.com

  @ApplicatioStart
  Scenario: To verify that the user is able to start gmail.com
    Given the chrome browser is installed
    Then the particular user logs in

  @Compose&Send
  Scenario: To verify that the user is able to login and compose an mail
    Given the particular user is already loggedin
    When the logged in user clicks on compose button
    And enters the sender email
    And enters the subject of the email
    And enters messageparagraphs in the email
    Then the sender will get the email

  @EmailCompose&Schedule
  Scenario: To verify that the user is able to compose & schedule an email
    Given the particular user is already loggedin
    When the logged in user clicks on compose button
    And enters the sender email
    And enters the subject of the email
    And enters messageparagraph in the email
    And clicks on Schedule Email
    Then user should be able to select date time and schedule the email

  @EmailCompose&CC&Send
  Scenario: To verify that the user is able to compose email along with sender and cc email
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And enters the sender email
    And enters the cc email
    And enters the subject of the email
    And enters the messageparagraph in the email
    Then the sender & cc  will get the email

  @EmailCompose&CC&Bcc&Send
  Scenario: To verify that the user is able to compose email along with sender, cc & bcc
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And enters the sender email
    And enters the cc email
    And enters the bcc email
    And enters the subject of the email
    And enters the messageparagraph in the email
    Then the sender, cc & bcc  will get the email

  @EmailComposewithoutanyemail
  Scenario: To verify that the user is sending email without sender email
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And enters the subject of the email
    And enters the messageparagraph in the email
    Then the user will not be able to send to the receiver

  @EmailComposewithwrongemail
  Scenario: To verify that the user is sending email with wrong email
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And enters the wrong sender email
    And enters the subject of the email
    And enters the messageparagraph in the email
    Then the sender will not get the email

  @EmailComposewithoutanydetails
  Scenario: To verify that the user is sending email without any info
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And click on the send email cta
    Then the user will not be able to send to the receiver
    And error message is displayed

  @EmailComposewithoutsubject
  Scenario: To verify that the user is sending email without any subject
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And enters the messageparagraph in the email
    Then the user will be able to send email to receiver

  @EmailComposewithoutBody
  Scenario: To verify that the user is sending email without any body
    Given the particular user is already loggedin
    When the logged in user clicks on the compose button
    And enters the subject of the email
    Then the user will be able to send email to receiver

  @Emailcomposewithemoji
  Scenario: To verify that the user is sending email with emojis
    Given the particular user is already loggedin
    When the logged in user clicks on compose button
    And enters the sender email
    And enters the subject of the email
    And enters messageparagraph in the email
    And user clicks on emoji selector
    And user selects any one emoji
    Then user sends email to the sender email

  @Emailcompose&discardfromicon
  Scenario: To verify that the user is composing an email & later discarding it by icon below
    Given the particular user is already loggedin
    When the logged in user clicks on compose button
    And enters the sender email
    And enters the subject of the email
    And enters messageparagraph in the email
    And user clicks on trash icon below
    Then the user should verify it from the drafts


  @AccountLogout
  Scenario: To close the browser
  Given  the particular user is already loggedin
  Then close the browser
